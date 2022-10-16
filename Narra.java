public class Narra extends Trees{
    private String type;
    public Narra(String treesname, String type){
        this.treesname = treesname;
        this.type = "Small";
    }
    public void settype(){
        if(type == "Big"){
            System.out.println("Big Tree");
        }
        else{
            System.out.println("Small Tree");
        }
    }
    public String gettype(){
        return this.type;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Type of a Tree: "+gettype());
    }
}
