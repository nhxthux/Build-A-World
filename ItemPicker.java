public class ItemPicker extends Character {
        
        private int maximumCapacity;
        
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
        
        public int getMaximumCapacity()
        {
            return maximumCapacity;
        }
        
        @Override
        public String toString()
        {
            return "Name: " + getName() + "\n" + "Stamina: " + getStamina() + "\n" + "Maximum capacity: " + maximumCapacity;
        }
}
