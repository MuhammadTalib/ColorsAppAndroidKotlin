package com.example.colors.ui.gallery

import MySimpleViewHolder
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.colors.ColorFullscreenActivity
import com.example.colors.R


data class ColorModel(val hex:String, val name: String, val rgb:String)

@Suppress("DEPRECATION")
class GalleryFragment : Fragment() {


    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<MySimpleViewHolder >? = null
    private lateinit var colors: ArrayList<ColorModel>
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
            colors = getColors()
            adapter = SimpleAdapter(R.layout.simpleitemview, colors, ::onItemClick)
        }
    }
    private fun onItemClick(position:Int, color:ColorModel){
//        val fragTrans = fragmentManager?.beginTransaction()
//        fragTrans?.add(R.id.fragmentsContainer, ColorFragment())
//        fragTrans?.addToBackStack(null)
//        fragTrans?.commit()
        val intent = Intent(activity, Color::class.java)
        intent.putExtra("position", position.toString());
        startActivity(intent)
    }
}
