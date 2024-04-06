package com.example.loginapplication

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {

    private lateinit var dataRecyclerView: RecyclerView
    private lateinit var Bjudul: Array<String>
    private lateinit var Bgambar: Array<Int>

    private lateinit var Bdetail: Array<String>

    private lateinit var listWisata: ArrayList<ItemData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Bgambar = arrayOf(
            R.drawable.img,
            R.drawable.img_1,
            R.drawable.img_4,
            R.drawable.img_2,
            R.drawable.img_3

        )

        Bjudul = arrayOf(
            "Wisata Kali Biru Genyem",
            "Wisata Pantai BaseGe",
            "Wisata Pantai Pasir 2",
            "Wisata Jembatan Merah",
            "Wisata Pulau Raja Ampat"
        )
        Bdetail = arrayOf(
            getString(R.string.kalbir),
            getString(R.string.baseg),
            getString(R.string.hol2),
            getString(R.string.jemer),
            getString(R.string.raja)


        )

        dataRecyclerView = findViewById(R.id.tampil)
        dataRecyclerView.layoutManager = LinearLayoutManager(this)

        listWisata = arrayListOf<ItemData>()
        getData()


    }

    private fun getData() {
        for (i in Bgambar.indices) {
            val dataBacaan = ItemData(Bgambar[i], Bjudul[i])
            listWisata.add(dataBacaan)
        }
        var adapter = wisataAdapter(listWisata)
        dataRecyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : wisataAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@Home, Detail::class.java)
                intent.putExtra("img", listWisata[position].gambar)
                intent.putExtra("jdl", listWisata[position].judul)

                intent.putExtra("dtl", Bdetail[position])

                startActivity(intent)


            }

        })


    }

}

