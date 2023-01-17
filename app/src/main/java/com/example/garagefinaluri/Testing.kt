package com.example.garagefinaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.garagefinaluri.dataclasses.Image

class Testing : AppCompatActivity() {

    private lateinit var button: Button


    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testing)
        button = findViewById(R.id.button13)

        goToMenu()

        val imageList = listOf<Image>(
            Image(
                R.drawable.georgia,
                "საქართველო",
                "მოსახლეობა 3,709 მილიონი\n" +
                        " დედაქალაქი - თბილისი\n" +
                        " სახელმწიფო მდებარეობს ევრაზიაში, კავკასიაში, შავი ზღვის აღმოსავლეთ სანაპიროზე.\n" +
                        " დამოუკიდებლობა - 1991 წლის 9 აპრილი\n" +
                        " კონსტიტუცია მიიღეს 1995 წლის 24 აგვისტოს .  \n"
            ),
            Image(
                R.drawable.england,
                "ინგლისი",
                " მოსახლეობა 55,98 მილიონი \n" +
                        "  დედაქალაქი - ლონდონი\n" +
                        "  სახელმწიფო მდებარეობს დიდი ბრიტანეთის კუნძულის სამხრეთ-აღმოსავლეთ ნაწილზე.\n" +
                        "  საპარლამენტო მმართველობა, კონსტიტუციური მონარქია.\n"
            ),
            Image(
                R.drawable.usa,
                "აშშ",
                " მოსახლეობა 331.9 მილიონი \n" +
                        " დედაქალაქი - ვაშინგტონი \n" +
                        " ქვეყნის ტერიტორიის ძირითადი ნაწილი მდებარეობს ჩრდილოეთ ამერიკის ცენტრალურ ნაწილში.\n" +
                        " საპრეზიდენტო რესპუბლიკა.\n"
            ),
            Image(
                R.drawable.francee,
                "საფრანგეთი",
                "მოსახლეობა 67,75 მილიონი\n" +
                        "დედაქალაქი - პარიზი\n" +
                        " ქვეყანა დასავლეთ ევროპაში, მოიცავს ევროპის ამ ნაწილის, რამდენიმე კუნძულისა და ზღვისიქითა ტერიტორიების ნაწილს.\n" +
                        " მმართველობა - ნახევრად საპრეზიდენტო\n"
            ),
            Image(
                R.drawable.germanyy,
                "გერმანია",
                " მოსახლეობა - 83,2 მილიონი\n" +
                        "  დედაქალაქი - ბერლინი \n" +
                        "   ქვეყანა ცენტრალურ ევროპაში.\n" +
                        "  მმართველობა - საპარლამენტო\n"
            ),
            Image(
                R.drawable.italy,
                "იტალია",
                "მოსახლეობა - 59.11 მილიონი\n" +
                        " დედაქალაქი - რომი \n" +
                        " ქვეყანა მდებარეობს სამხრეთ-დასავლეთ ევროპაში. \n" +
                        " მმართველობა საპარლამენტო, კონსტიტუციური რესპუბლიკა\n"
            ),
            Image(
                R.drawable.spain,
                "ესპანეთი ",
                " მოსახლეობა - 47.42 მილიონი\n" +
                        "   დედაქალაქი - მადრიდი\n" +
                        " სახელმწიფო ევროპის სამხრეთ-დასავლეთით, პირენეს ნახევარკუნძულზე.\n" +
                        " მმართველობა საპარლამენტო, კონსტიტუციური მონარქია\n"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }

    private fun goToMenu() {
        button.setOnClickListener() {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
            finish()
        }
    }
}