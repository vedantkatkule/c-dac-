public class InstanceCounter {
    
    private static int instanceCount = 0;

    public InstanceCounter() {
        instanceCount++;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            instanceCount--;
        } finally {
            super.finalize();
        }
    }
    public static void main(String[] args) {
        // Create instances
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        
        System.out.println("Instance count after creating obj1 and obj2: " + InstanceCounter.getInstanceCount()); // Should print 2
        
        obj1 = null;
        System.gc();
        try {
            Thread.sleep(1000); // Wait for 1 second to let GC do its job
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Instance count after garbage collection: " + InstanceCounter.getInstanceCount()); // Should print 1
        
        obj2 = null;
        System.gc(); 
        
        try {
            Thread.sleep(1000); // Wait for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
        System.out.println("Instance count after deleting obj2: " + InstanceCounter.getInstanceCount());
    }
}
