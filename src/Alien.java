public class Alien {

    private int energyLevel;
    private int hostilityIndex;

    public Alien(int pEnergyLevel, int pHostilityIndex){
        energyLevel = pEnergyLevel;
        hostilityIndex = pHostilityIndex;

        printInfo();
    }

    public int getEnergyLevel(){
        return energyLevel;
    }

    public void setEnergyLevel(int x){
        energyLevel = x;
    }

    public int getHostilityIndex(){
        return hostilityIndex;
    }

    public void setHostilityIndex(int y){
        this.hostilityIndex = y;
    }

    public void printInfo(){
        System.out.println("The energy level is: " + getEnergyLevel());
        System.out.println("the hostility index is: " + getHostilityIndex());
        //another to do this
        //System.out.println("The hostility index is " + hostilityIndex);
        System.out.println("Energy level is set to: " + energyLevel);
        System.out.println("Hostility index is set to: " + hostilityIndex);

    }

}
