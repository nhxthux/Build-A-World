public class Item {
    
        private String name;
        private String rarity;
        
        /*
        * Construct an item consisting of name and rarity
        * @param number - the number will determine the item outcome
        */
        public Item(int number)
        {
            if (number == 1)
            {
                name = "magic wand";
                rarity = "rare";
            }
            else if (number == 2)
            {
                name = "mighty sword";
                rarity = "special";
            }
            else if (number == 3)
            {
                name = "spellbook";
                rarity = "common";
            }
        }
        
        /*
        * Return the name of the item
        * @return name of the item
        */
        public String returnName()
        {
            return name;
        }
        
        /*
        * Return the rarity of the item
        * @return rarity of the item
        */
        public String returnRarity()
        {
            return rarity;
        }
        
        /*
        * Return a toString
        * @return a string consisting of name and rarity
        */
        public String toString()
        {
            return "Item name: " + name + "\n" + "Rarity: " + rarity;
        }
}
