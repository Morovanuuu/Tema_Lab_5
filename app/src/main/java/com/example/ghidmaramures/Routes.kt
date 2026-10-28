package com.example.ghidmaramures


import kotlinx.serialization.Serializable

// Rute principale pentru ecranul de autentificare și tab-uri
@Serializable
object LoginRoute

@Serializable
object CategoriiRoute

@Serializable
object FavoriteRoute

@Serializable
object DespreRoute

// Ruta pentru detaliul unui loc - transmite doar ID-ul ca argument, conform cerințelor
@Serializable
data class PlaceDetailRoute(val id: Int)