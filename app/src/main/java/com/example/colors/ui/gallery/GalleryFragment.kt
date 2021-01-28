package com.example.colors.ui.gallery

import MySimpleViewHolder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.colors.R

data class ColorModel(val hex:String, val name: String, val rgb:String)

class GalleryFragment : Fragment() {


    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<MySimpleViewHolder >? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

        val recycler_view = itemView.findViewById<RecyclerView>(R.id.recyclerView)
        recycler_view.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = GridLayoutManager(activity,3)
            // set the custom adapter to the RecyclerView
            val colors = arrayListOf<ColorModel>(
                ColorModel("#EFDECD", "Almond", "(239, 222, 205)"),
                ColorModel("#CD9575","Antique Brass", "(205, 149, 117)"),
                ColorModel("#FDD9B5","Apricot", "(253, 217, 181)"),
                ColorModel("#78DBE2","Aquamarine", "(120, 219, 226)"),
                ColorModel("#87A96B","Asparagus", "(135, 169, 107)"),
                ColorModel("#FFA474","Atomic Tangerine", "(255, 164, 116)"),
                ColorModel("#FAE7B5","Banana Mania", "(250, 231, 181)"),
                ColorModel("#9F8170","Beaver", "(159, 129, 112)"),
                ColorModel("#FD7C6E","Bittersweet", "(253, 124, 110)"),
                ColorModel("#000000","Black", "(0,0,0)"),
                ColorModel("#ACE5EE","Blizzard Blue", "(172, 229, 238)"),
                ColorModel("#1F75FE","Blue", "(31, 117, 254)"),
                ColorModel("#A2A2D0","Blue Bell", "(162, 162, 208)"),
                ColorModel("#6699CC","Blue Gray", "(102, 153, 204)"),
                ColorModel("#0D98BA","Blue Green", "(13, 152, 186)"),
                ColorModel("#7366BD","Blue Violet", "(115, 102, 189)"),
                ColorModel("#DE5D83","Blush", "(222, 93, 131)"),
                ColorModel("#CB4154","Brick Red", "(203, 65, 84)"),
                ColorModel("#B4674D","Brown", "(180, 103, 77)"),
                ColorModel("#FF7F49","Burnt Orange", "(255, 127, 73)"),
                ColorModel("#EA7E5D","Burnt Sienna", "(234, 126, 93)"),
                ColorModel("#B0B7C6","Cadet Blue", "(176, 183, 198)"),
                ColorModel("#FFFF99","Canary", "(255, 255, 153)"),
                ColorModel("#1CD3A2","Caribbean Green", "(28, 211, 162)"),
                ColorModel("#FFAACC","Carnation Pink", "(255, 170, 204)"),
                ColorModel("#DD4492","Cerise", "(221, 68, 146)"),
                ColorModel("#1DACD6","Cerulean", "(29, 172, 214)"),
                ColorModel("#BC5D58","Chestnut", "(188, 93, 88)"),
                ColorModel("#DD9475","Copper", "(221, 148, 117)"),
                ColorModel("#9ACEEB","Cornflower", "(154, 206, 235)"),
                ColorModel("#FFBCD9","Cotton Candy", "(255, 188, 217)"),
                ColorModel("#FDDB6D","Dandelion", "(253, 219, 109)"),
                ColorModel("#2B6CC4","Denim", "(43, 108, 196)"),
                ColorModel("#EFCDB8","Desert Sand", "(239, 205, 184)"),
                ColorModel("#6E5160","Eggplant", "(110, 81, 96)"),
                ColorModel("#CEFF1D","Electric Lime", "(206, 255, 29)"),
                ColorModel("#71BC78","Fern", "(113, 188, 120)"),
                ColorModel("#6DAE81","Forest Green", "(109, 174, 129)"),
                ColorModel("#C364C5","Fuchsia", "(195, 100, 197)"),
                ColorModel("#CC6666","Fuzzy Wuzzy", "(204, 102, 102)"),
                ColorModel("#E7C697","Gold", "(231, 198, 151)"),
                ColorModel("#FCD975","Goldenrod", "(252, 217, 117)"),
                ColorModel("#A8E4A0","Granny Smith Apple", "(168, 228, 160)"),
                ColorModel("#95918C","Gray", "(149, 145, 140)"),
                ColorModel("#1CAC78","Green", "(28, 172, 120)"),
                ColorModel("#1164B4","Green Blue", "(17, 100, 180)"),
                ColorModel("#F0E891","Green Yellow", "(240, 232, 145)"),
                ColorModel("#FF1DCE","Hot Magenta", "(255, 29, 206)"),
                ColorModel("#B2EC5D","Inchworm", "(178, 236, 93)"),
                ColorModel("#5D76CB","Indigo", "(93, 118, 203)"),
                ColorModel("#CA3767","Jazzberry Jam", "(202, 55, 103)"),
                ColorModel("#3BB08F","Jungle Green", "(59, 176, 143)"),
                ColorModel("#FEFE22","Laser Lemon", "(254, 254, 34)"),
                ColorModel("#FCB4D5","Lavender", "(252, 180, 213)"),
                ColorModel("#FFF44F","Lemon Yellow", "(255, 244, 79)"),
                ColorModel("#FFBD88","Macaroni and Cheese", "(255, 189, 136)"),
                ColorModel("#F664AF","Magenta", "(246, 100, 175)"),
                ColorModel("#AAF0D1","Magic Mint", "(170, 240, 209)"),
                ColorModel("#CD4A4C","Mahogany", "(205, 74, 76)"),
                ColorModel("#EDD19C","Maize", "(237, 209, 156)"),
                ColorModel("#979AAA","Manatee", "(151, 154, 170)"),
                ColorModel("#FF8243","Mango Tango", "(255, 130, 67)"),
                ColorModel("#C8385A","Maroon", "(200, 56, 90)"),
                ColorModel("#EF98AA","Mauvelous", "(239, 152, 170)"),
                ColorModel("#FDBCB4","Melon", "(253, 188, 180)"),
                ColorModel("#1A4876","Midnight Blue", "(26, 72, 118)"),
                ColorModel("#30BA8F","Mountain Meadow", "(48, 186, 143)"),
                ColorModel("#C54B8C","Mulberry", "(197, 75, 140)"),
                ColorModel("#1974D2","Navy Blue", "(25, 116, 210)"),
                ColorModel("#FFA343","Neon Carrot", "(255, 163, 67)"),
                ColorModel("#BAB86C","Olive Green", "(186, 184, 108)"),
                ColorModel("#FF7538","Orange", "(255, 117, 56)"),
                ColorModel("#FF2B2B","Orange Red", "(255, 43, 43)"),
                ColorModel("#F8D568","Orange Yellow", "(248, 213, 104)"),
                ColorModel("#E6A8D7","Orchid", "(230, 168, 215)"),
                ColorModel("#414A4C","Outer Space", "(65, 74, 76)"),
                ColorModel("#FF6E4A","Outrageous Orange", "(255, 110, 74)"),
                ColorModel("#1CA9C9","Pacific Blue", "(28, 169, 201)"),
                ColorModel("#FFCFAB","Peach", "(255, 207, 171)"),
                ColorModel("#C5D0E6","Periwinkle", "(197, 208, 230)"),
                ColorModel("#FDDDE6","Piggy Pink", "(253, 221, 230)"),
                ColorModel("#158078","Pine Green", "(21, 128, 120)"),
                ColorModel("#FC74FD","Pink Flamingo", "(252, 116, 253)"),
                ColorModel("#F78FA7","Pink Sherbet", "(247, 143, 167)"),
                ColorModel("#8E4585","Plum", "(142, 69, 133)"),
                ColorModel("#7442C8","Purple Heart", "(116, 66, 200)"),
                ColorModel("#9D81BA","Purple Mountain's Majesty", "(157, 129, 186)"),
                ColorModel("#FE4EDA","Purple Pizzazz", "(254, 78, 218)"),
                ColorModel("#FF496C","Radical Red", "(255, 73, 108)"),
                ColorModel("#D68A59","Raw Sienna", "(214, 138, 89)"),
                ColorModel("#714B23","Raw Umber", "(113, 75, 35)"),
                ColorModel("#FF48D0","Razzle Dazzle Rose", "(255, 72, 208)"),
                ColorModel("#E3256B","Razzmatazz", "(227, 37, 107)"),
                ColorModel("#EE204D","Red", "(238,32 ,77 )"),
                ColorModel("#FF5349","Red Orange", "(255, 83, 73)"),
                ColorModel("#C0448F","Red Violet", "(192, 68, 143)"),
                ColorModel("#1FCECB","Robin's Egg Blue", "(31, 206, 203)"),
                ColorModel("#7851A9","Royal Purple", "(120, 81, 169)"),
                ColorModel("#FF9BAA","Salmon", "(255, 155, 170)"),
                ColorModel("#FC2847","Scarlet", "(252, 40, 71)"),
                ColorModel("#76FF7A","Screamin' Green", "(118, 255, 122)"),
                ColorModel("#9FE2BF","Sea Green", "(159, 226, 191)"),
                ColorModel("#A5694F","Sepia", "(165, 105, 79)"),
                ColorModel("#8A795D","Shadow", "(138, 121, 93)"),
                ColorModel("#45CEA2","Shamrock", "(69, 206, 162)"),
                ColorModel("#FB7EFD","Shocking Pink", "(251, 126, 253)"),
                ColorModel("#CDC5C2","Silver", "(205, 197, 194)"),
                ColorModel("#80DAEB","Sky Blue", "(128, 218, 235)"),
                ColorModel("#ECEABE","Spring Green", "(236, 234, 190)"),
                ColorModel("#FFCF48","Sunglow", "(255, 207, 72)"),
                ColorModel("#FD5E53","Sunset Orange", "(253, 94, 83)"),
                ColorModel("#FAA76C","Tan", "(250, 167, 108)"),
                ColorModel("#18A7B5","Teal Blue", "(24, 167, 181)"),
                ColorModel("#EBC7DF","Thistle", "(235, 199, 223)"),
                ColorModel("#FC89AC","Tickle Me Pink", "(252, 137, 172)"),
                ColorModel("#DBD7D2","Timberwolf", "(219, 215, 210)"),
                ColorModel("#17806D","Tropical Rain Forest", "(23, 128, 109)"),
                ColorModel("#DEAA88","Tumbleweed", "(222, 170, 136)"),
                ColorModel("#77DDE7","Turquoise Blue", "(119, 221, 231)"),
                ColorModel("#FFFF66","Unmellow Yellow", "(255, 255, 102)"),
                ColorModel("#926EAE","Violet (Purple)", "(146, 110, 174)"),
                ColorModel("#324AB2","Violet Blue", "(50, 74, 178)"),
                ColorModel("#F75394","Violet Red", "(247, 83, 148)"),
                ColorModel("#FFA089","Vivid Tangerine", "(255, 160, 137)"),
                ColorModel("#8F509D","Vivid Violet", "(143, 80, 157)"),
                ColorModel("#A2ADD0","Wild Blue Yonder", "(162, 173, 208)"),
                ColorModel("#FF43A4","Wild Strawberry", "(255, 67, 164)"),
                ColorModel("#FC6C85","Wild Watermelon", "(252, 108, 133)"),
                ColorModel("#CDA4DE","Wisteria", "(205, 164, 222)"),
                ColorModel("#FCE883","Yellow", "(252, 232, 131)"),
                ColorModel("#C5E384","Yellow Green", "(197, 227, 132)"),
                ColorModel("#FFAE42","Yellow Orange", "(255, 174, 66)")
             );

            adapter = SimpleAdapter(R.layout.simpleitemview, colors)
        }
    }
}