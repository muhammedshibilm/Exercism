class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}


 class Warrior extends Fighter{
  
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

}

 class Wizard extends Fighter {
  
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }


    public boolean  prepareSpell(){
        return  isVulnerable();
    }
    
}