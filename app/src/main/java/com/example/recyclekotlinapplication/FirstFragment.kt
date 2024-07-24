package com.example.recyclekotlinapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclekotlinapplication.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var contactAdapter: ContactAdapter
    private var contactList: ArrayList<String> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        setupRecyclerView()
    }

    private fun loadData() {
        contactList.add("Adilet")
        contactList.add("Erjan")
        contactList.add("Aisuluu")
        contactList.add("Julie")
        contactList.add("Alice")
        contactList.add("Book")
        contactList.add("Father")
        contactList.add("Mother")
        contactList.add("Sister")
        contactList.add("Aitegin")
        contactList.add("Bekmyrza")
    }

    private fun setupRecyclerView() {
        contactAdapter = ContactAdapter(contactList)
        binding.rvCont.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = contactAdapter
        }
    }
}
