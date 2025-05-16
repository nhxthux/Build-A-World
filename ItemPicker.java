public class ItemPicker extends Character {
        
        private int maximumCapacity;
        
        /*
        * Construct a character with name, stamina and maximum capacity
        * @param name
        * @param maximum value
        */
        public ItemPicker(String name, int max)
        {
            super(name);
            if (max <= 50)
            {
                maximumCapacity = max;
            }
            else
            {
                maximumCapacity = 50;
            }
        }
        
        /*
        * Expand the inventory with more slots based on the character's current stamina
        * @param expand - the more slots that users want to add
        */
        public void expansion(int expand)
        {
            if (expand <= getStamina())
            {
                maximumCapacity += expand;
                reduceStamina(expand);
            }
            else
            {
                System.out.println("You do not have enough stamina to expand the inventory!");
                System.out.println("");
            }
        }
        
        /*
        * Return the maximum capacity value
        * @return maximumCapactiy - the maximum capacity value
        */
        public int getMaximumCapacity()
        {
            return maximumCapacity;
        }
        
        /*
        * Return a toString
        * @return a string consisting of name, stamina, and maximum value
        */
        @Override
        public String toString()
        {
            return "Name: " + getName() + "\n" + "Stamina: " + getStamina() + "\n" + "Maximum capacity: " + maximumCapacity;
        }
}
