public class Character {
        
        private String name;
        private int stamina;
        
        public Character(String name)
        {
            this.name = name;
            stamina = 50;
        }
        
        public String getName()
        {
            return name;
        }
        
        public int getStamina()
        {
            return stamina;
        }
        
        public void reduceStamina(int number)
        {
            stamina -= number;
        }
        
        public String toString()
        {
            return "Name: " + name + "\n" + "Stamina: " + stamina;
        }
        
}
