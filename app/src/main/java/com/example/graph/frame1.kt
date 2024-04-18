package com.example.graph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class frame1 : Fragment() {
    //    lateinit var control: NavController
    //    lateinit var click: Button
    lateinit var recycler: RecyclerView
    lateinit var itemlist: ArrayList<data>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler = view.findViewById(R.id.recycler)
        itemlist = ArrayList()
        itemlist.add(data(R.drawable.me,"Lionel Messi","Lionel Messi is a football player from Argentina who plays for Inter Miami. He has won the Ballon D'Or, the annual award given to the best player in the world, 8 times, 2022 FIFA World Cup winner and an Olympic gold medal winner in 2008. He was born in 1987 in Rosario, Argentina's third-biggest city.",R.drawable.me,
            R.drawable.like,R.drawable.comment,R.drawable.share))
        itemlist.add(data(R.drawable.ro,"Cristiano Ronaldo","Cristiano Ronaldo dos Santos Aveiro was born on February 5, 1985, in Madeira, Portugal to Maria Dolores dos Santos Aveiro and José Diniz Aveiro. Cristiano has an elder brother, Hugo and two elder sisters, Elma and Liliana Cátia.",R.drawable.ro,
            R.drawable.like,R.drawable.comment,R.drawable.share))
        itemlist.add(data(R.drawable.zizo,"Zizo","Ahmed Mostafa Mohamed Sayed commonly known as Zizo, is an Egyptian professional footballer who plays as a winger for Egyptian Premier League club Zamalek and the Egypt national team. ",R.drawable.zizo,
            R.drawable.like,R.drawable.comment,R.drawable.share))
        recycler.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        recycler.adapter=CustomAdapter(itemlist,requireActivity())
//        control = Navigation.findNavController(view)
//        click = view.findViewById(R.id.click)
//        click.setOnClickListener {
////            control.navigate(R.id.action_frame1_to_frame2)
////            val action = frame1Directions.actionFrame1ToFrame2("Welcome")
////            control.navigate(action)
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frame1, container, false)
    }

}