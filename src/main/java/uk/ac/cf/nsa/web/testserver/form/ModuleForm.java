package uk.ac.cf.nsa.web.testserver.form;


public class ModuleForm {
    private String moduleCode;
    private String moduleTitle;
    private int credits;

    public ModuleForm(String moduleCode, String moduleTitle, int credits){
        this.moduleCode= moduleCode;
        this.moduleTitle= moduleTitle;
        this.credits=credits;
    }

    public int getCredits() {
        return credits;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public String getModuleTitle() {
        return moduleTitle;
    }
}
