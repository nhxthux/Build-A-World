public class Item {
    
        private String name;
        private String rarity;
        
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
        
        public String returnName()
        {
            return name;
        }
        
        public String returnRarity()
        {
            return rarity;
        }
    
        public String toString()
        {
            return "Item name: " + name + "\n" + "Rarity: " + rarity;
        }
}
