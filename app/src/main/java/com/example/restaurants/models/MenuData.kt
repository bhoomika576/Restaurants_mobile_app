package com.example.restaurants.models

import com.example.restaurants.R

class MenuData {
    fun getMenuList(): List<Menu> {

        return listOf(
            Menu("Chicken Pad Thai","20 min","Centre Commercial de L'Harmonie, Le Morne Brabant","Rs 365",
                R.drawable.img1),
            Menu("Butter Chicken","32 min","Park side, Sodnac Link Rd","Rs 480",R.drawable.img2),
            Menu("Grilled Fish","28 min","Valentina Mall, Vacoas-Phoenix","Rs 320",R.drawable.img3),
            Menu("Spicy Tomato Chicken Curry","15 min","Park side, Sodnac Link Rd","Rs 480",R.drawable.img4),
            Menu("Chicken Burger","48 min","Hillcrest Avenue, Sodnac","Rs 305",R.drawable.img5),
            Menu("Mine Bouille Agneau Saute","19 min","Holywood No Vacoas, Vacoas","Rs 185",R.drawable.img6),
            Menu("Hot & Sour Soup","14 min","2, Avenue des Palmiers, Quatre Bornes","Rs 275",R.drawable.img7),
            Menu("Briyani","32 min","11, Boundary Road,, Rose-Hill","Rs 210",R.drawable.img8),
            Menu("Fried Rice With Lamb","32 min","Avenue des Orchides, Quatre Bornes","Rs 285",R.drawable.img9),
            Menu("Magic Bowl Chicken","31 min","11, Boundary Road,, Rose-Hill","Rs 415",R.drawable.img10),
            Menu("Sizzling Chicken","32 min","11, Boundary Road,, Rose-Hill","Rs 460",R.drawable.img11),
            Menu("Fried Meefoon Veg","26 min","Nexteracom Tower 2 B1 Ebene City, Ebene","Rs 275",R.drawable.img12),
        )
    }


}