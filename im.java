package oppsclanandobj;

interface father{
    abstract void senti();
    abstract void bee();
}
interface mother{
    abstract void senti();
    abstract void bee();
    
}

    class sone implements father,mother{
        public void senti(){
            System.out.println("senting");
        }
        public void bee(){
            System.out.println("bees");
        }
            public static void main(String[] args) {
                sone obj =new sone();
                obj.senti();
                obj.bee();;
            }
    }