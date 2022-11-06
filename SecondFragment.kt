package com.example.coffe_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

private lateinit var comunicator: Comunicator

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val coffeFragment = CoffeFragment()

        val ibCoffe1 = view.findViewById<ImageButton>(R.id.coffe1)
        val twCoffe1 = view.findViewById<TextView>(R.id.coffe_name1)

        val ibCoffe2 = view.findViewById<ImageButton>(R.id.coffe2)
        val twCoffe2 = view.findViewById<TextView>(R.id.coffe_name2)

        val ibCoffe3 = view.findViewById<ImageButton>(R.id.coffe3)
        val twCoffe3 = view.findViewById<TextView>(R.id.coffe_name3)

        val ibCoffe4 = view.findViewById<ImageButton>(R.id.coffe4)
        val twCoffe4 = view.findViewById<TextView>(R.id.coffe_name4)

        val ibCoffe5 = view.findViewById<ImageButton>(R.id.coffe5)
        val twCoffe5 = view.findViewById<TextView>(R.id.coffe_name5)

        val ibCoffe6 = view.findViewById<ImageButton>(R.id.coffe6)
        val twCoffe6 = view.findViewById<TextView>(R.id.coffe_name6)

        val ibCoffe7 = view.findViewById<ImageButton>(R.id.coffe7)
        val twCoffe7 = view.findViewById<TextView>(R.id.coffe_name7)

        val ibCoffe8 = view.findViewById<ImageButton>(R.id.coffe8)
        val twCoffe8 = view.findViewById<TextView>(R.id.coffe_name8)

        twCoffe1.text="Cappucino"
        twCoffe3.text="Espresso"
        twCoffe7.text="Irish"
        twCoffe8.text="Toffe"
        twCoffe2.text="Mocha"
        twCoffe6.text="Hazelnut"
        twCoffe5.text="Ice coffe"
        twCoffe4.text="Latte"


        comunicator=activity as Comunicator

        ibCoffe1.setOnClickListener {
            val description = "Brew an espresso in the cappuccino cup. Froth the milk in a milk jug.  Alternatively use a milk frother. The milk froth should be firm and creamy. Pour the milk into the cappuccino cup so that the dark of the espresso is still visible at the edge. The foam should be about 1cm  thick."
            comunicator.passData(twCoffe1.text.toString(),description)

        }

        ibCoffe3.setOnClickListener {
            val description = "Grind and measure your beans. Using dark roast coffee beans and a quality grinder, grind enough beans to make one or two espresso shots.Once you have an amount of grounds in your portafilter place the portafilter on the countertop or other flat surface, and then use the tamper to tamp down on the grounds.Pull your shot ,The espresso should be ready after 25 to 30 seconds.The final product shouldn’t be too light or dark in color, shouldn’t taste too acidic or too bitter, and should have a fine layer of caramel-colored crema on top."
            comunicator.passData(twCoffe3.text.toString(),description)

        }

        ibCoffe2.setOnClickListener {
            val description = "Brew an espresso into a mug, cup or glass. Add two teaspoons of hot chocolate mix or cocoa powder and mix with the espresso.* Foam and texture the required quantity of milk, ensuring we have a good quality foam. Add the milk to the cup containing the chocolate espresso and top with whipped cream. Dust with more cocoa powder before serving."
            comunicator.passData(twCoffe2.text.toString(),description)

        }

        ibCoffe4.setOnClickListener {
            val description = "Prepare an espresso (single or double) directly into a latte glass 1/3 fill your milk jug — whole milk is recommended Purge your steam arm prior to attempting to steam your milk Foam your milk prior to brewing your espresso, paying attention to creating a nice smooth microfoam After foaming/frothing your milk, gently tap the jug or bump on a table to remove any unwanted large air bubbles Begin pouring the frothed milk to your espresso from a relatively high position Continue to pour whilst lowering the milk and steepening your pouring angle Ensure a small amount of stiff milk foam sits on top after pouring Enjoy your Latte!"
            comunicator.passData(twCoffe4.text.toString(),description)

        }

        ibCoffe5.setOnClickListener {
            val description = "Fill the glass full to the rim with ice.Pour room temperature (or chilled) coffee into the glass, fill it almost to the top.Pour in the white cream made od cream and milk together mixed. Add chocolate powder on top and serve. "
            comunicator.passData(twCoffe5.text.toString(),description)

        }

        ibCoffe6.setOnClickListener {
            val description = "Combine the condensed milk and half and half. Add 1 14-ounce (396 ml) can of sweetened condensed milk and 1 ¾ cup (414 ml) of half and half to a medium size bowl. Stir well to ensure that they’re well combined. Add the syrups and vanilla paste. Once the condensed milk and half and half are combined, stir 3 tablespoons (45 ml) of chocolate syrup, 2 tablespoons (30 ml) of hazelnut syrup, and 1 teaspoon (5 ml) of vanilla bean paste into the mixture. Mix well until all of the ingredients are fully incorporated. Mix the desired amount into your coffee. Transfer the creamer mixture to a airtight container that’s easy to pour from, and add the desired amount to a cup of hot coffee. Keep in mind that the more creamer that you add, the stronger the chocolate hazelnut flavor will be in your coffee."
            comunicator.passData(twCoffe6.text.toString(),description)

        }

        ibCoffe7.setOnClickListener {
            val description = "Heat your glass with some boiling water.Heating the glass keeps your Irish Coffee warm for longer so you can savour the moment. Pour in a measure of Irish whiskey Add some coffee add in a spoonful of sugar. Make sure the sugar is mixed into the coffee well and add the cream Whisk some cream in a bowl. Don’t whisk the cream too stiffly or you won’t be able to pour it. Turn a spoon upside down and place the tip of the spoon inside the coffee glass just on top of the coffee making sure that the edge of the spoon is touching the glass Now slowly pour the whipped cream over the spoon. It should flow over the top of the spoon and land softly on top of the coffee. When you pour the cream gently it ensures that it doesn’t sink into the coffee Sprinkle some chocolate on top of the cream."
            comunicator.passData(twCoffe7.text.toString(),description)

        }

        ibCoffe8.setOnClickListener {
            val description = "In a small bowl, beat cream until it begins to thicken. Add confectioners' sugar; beat until stiff peaks form. Stir toffee bits into coffee; let stand for 30 seconds. Strain and discard any undissolved toffee bits. Pour coffee into mugs; top with whipped cream and drizzle with butterscotch topping."
            comunicator.passData(twCoffe8.text.toString(),description)

        }




        return view
    }
}