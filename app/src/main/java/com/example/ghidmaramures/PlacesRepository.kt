package com.example.ghidmaramures

// Modelul de date pentru un obiectiv turistic
data class Place(
    val id: Int,
    val nume: String,
    val categorie: String,
    val localitate: String,
    val descriere: String
)

// Sursa unică de date, conform cerințelor (minim 9 obiective)
object PlacesRepository {
    val places = listOf(
        // Categoria: Muzee
        Place(1, "Muzeul Satului Maramureșean", "Muzee", "Sighetu Marmației", "Muzeu în aer liber ce reconstituie un sat tipic maramureșean cu arhitectură tradițională din lemn."),
        Place(2, "Memorialul Victimelor Comunismului și al Rezistenței", "Muzee", "Sighetu Marmației", "Fosta închisoare politică transformată într-un memorial dedicat victimelor regimului comunist."),
        Place(3, "Muzeul Județean de Istorie și Arheologie Maramureș", "Muzee", "Baia Mare", "Găzduiește expoziții valoroase de istorie, incluzând tezaure monetare și artefacte locale."),

        // Categoria: Sport
        Place(4, "Domeniul schiabil Cavnic", "Sport", "Cavnic", "Pârtii excelente pentru schi și snowboard, dotate cu instalații de transport pe cablu și nocturnă."),
        Place(5, "Stațiunea Borșa (schi, drumeții)", "Sport", "Borșa", "Destinație montană de top, faimoasă pentru pârtia olimpică și accesul către atracții naturale."),
        Place(6, "Parcul Național Munții Rodnei (trasee montane)", "Sport", "Borșa / Moisei", "Cea mai extinsă arie protejată din nordul Carpaților, ideală pentru alpinism și drumeții."),

        // Categoria: Restaurante
        Place(7, "Casa Iurca de Călinești", "Restaurante", "Sighetu Marmației", "Restaurant tradițional renumit pentru preparatele autentice maramureșene și muzica folk live."),
        Place(8, "Hanul Teilor", "Restaurante", "Dănești", "Locație rustică primitoare, oferind preparate locale într-o atmosferă tradițională autentică."),
        Place(9, "Restaurant Pintea Haiducul", "Restaurante", "Baia Mare", "Restaurant cu specific românesc, apreciat pentru platourile haiducești și designul tematic.")
    )
}