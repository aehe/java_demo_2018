package com.example.demo;

abstract class Employee {
    String id;
    String name;
    double salary;
    int type;
    
    abstract double calculateSalary(); 
}

class FullTimeEmployee extends Employee {
    
    @Override
    double calculateSalary() {
        return 1000;
    }
    
}
class ContractEmployee extends Employee {

    @Override
    double calculateSalary() {
        // TODO Auto-generated method stub
        return 0;
    }    
}

class xxxEmployee extends Employee {
    int workingHour;
    double salary;
    
    @Override
    double calculateSalary() {
        // TODO Auto-generated method stub
        return 0;
    }
}


/*Interface*/
interface IReport {
    void genHeader();
    void genBody();
    void genFooter();
}

/*Abstract*/
abstract class Report {
    abstract void genHeader();
    abstract void genBody();
    abstract void genFooter();
    
    public void generate() {
        genHeader();
        genBody();
        genFooter();
    }
}

/*Abstract*/
class Report1 extends Report {

    @Override
    void genHeader() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void genBody() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void genFooter() {
        // TODO Auto-generated method stub
        
    }    
}

/*Interface*/
class Report2 implements IReport {

    @Override
    public void genHeader() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void genBody() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void genFooter() {
        // TODO Auto-generated method stub
        
    }
    
}

class GenerateReport {
    void generate(IReport report){
        report.genHeader();
        report.genBody();
        report.genFooter();        
    }    
}




public class DemoInheritance {
    public static void main(String[] args) {
        
        //Interface
        IReport report2 = new Report2();
        GenerateReport genReport = new GenerateReport();
        genReport.generate(report2);
        
        //Abstract
        Report1 report1 = new Report1();
        report1.generate();
    }

}
