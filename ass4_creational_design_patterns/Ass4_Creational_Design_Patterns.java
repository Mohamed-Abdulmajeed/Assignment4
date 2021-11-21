
package ass4_creational_design_patterns;

public class Ass4_Creational_Design_Patterns {

    public static void main(String[] args) {
        
       Doctor_CS docCS = new Doctor_CS();
       docCS.Salary=2000;
       docCS.YearsOfWork=5;
       memeberFactory_CS mCS1 = new memeberFactory_CS();
       mCS1.setDocCS(docCS);
       
       TeachingAssistant_CS teachCS = new TeachingAssistant_CS();
       teachCS.Salary=1500;
       teachCS.YearsOfWork=3;
       memeberFactory_CS mCS2 = new memeberFactory_CS();
       mCS2.setTeachAssistant(teachCS);
       
       memeberFactory_IS mIS1 = new memeberFactory_IS();
       memeberFactory_IS mIS2 = new memeberFactory_IS();
        
       memeberFactory_IT mIT1 = new memeberFactory_IT();
       memeberFactory_IT mIT2 = new memeberFactory_IT();
    }
    
}
