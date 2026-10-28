# Ghidul Maramureșului - Lab 5

Aplicație Android (Jetpack Compose) pentru prezentarea obiectivelor turistice din Maramureș.

## Mod de rulare
1. Clonează acest repository.
2. Deschide proiectul în Android Studio.
3. Așteaptă sincronizarea Gradle și rulează aplicația pe emulator sau dispozitiv fizic (minim API 24).

## Diagrama fluxului de navigare
Arhitectura respectă principiul State Hoisting și utilizează rute Type-Safe (@Serializable).

* **LoginRoute** 
  * -> `onLoginSuccess` -> **CategoriiRoute** 
  * *(Curățare stivă: `popUpTo<LoginRoute> { inclusive = true }` pentru a preveni întoarcerea la Login din tasta Back)*
* **Bara de navigare inferioară (Bottom Nav)**
  * Conectează **CategoriiRoute**, **FavoriteRoute** și **DespreRoute**.
  * Folosește `saveState = true`, `restoreState = true` și `launchSingleTop = true` pentru a păstra starea tab-urilor.
* **CategoriiRoute / FavoriteRoute**
  * -> `onPlaceClick(id: Int)` -> **PlaceDetailRoute(val id: Int)** *(se trimite doar ID-ul ca argument)*
* **PlaceDetailRoute**
  * -> `onBackClick` / Back de sistem -> Revine la ecranul anterior logic (păstrând filtrul ales).
