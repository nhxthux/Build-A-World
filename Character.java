public class Character {
        
        private String name;
        private int stamina;
        
        /*
        * Construct a character with name and a pre-determined stamina
        * @param name of the character
        */
        public Character(String name)
        {
            this.name = name;
            stamina = 50;
        }
        
        /*
        * Return the name of the character
        * @return name of the character
        */
        public String getName()
        {
            return name;
        }
        
        /*
        * Return the stamina of the character
        * @return stamina of the character
        */
        public int getStamina()
        {
            return stamina;
        }
        
        /*
        * Reduce the stamina by a number
        * @param number - the number that the stamina would be reduced by
        */
        public void reduceStamina(int number)
        {
            stamina -= number;
        }
        
        /*
        * Return a toString
        * @return a string consisting of name and stamina
        */
        public String toString()
        {
            return "Name: " + name + "\n" + "Stamina: " + stamina;
        }
        
}
