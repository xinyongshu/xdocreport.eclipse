package fr.opensagres.xdocreport.eclipse.demo.resume;

import org.dynaresume.services.ResumeService;
import org.eclipse.ui.services.IServiceLocator;


public class ResumeServiceFactory extends
		org.eclipse.ui.services.AbstractServiceFactory {

	private ResumeService resumeService;
	
	public void setResumeService(ResumeService resumeService) {
		this.resumeService = resumeService;
	}
	public ResumeServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object create(Class serviceInterface, IServiceLocator parentLocator,
			IServiceLocator locator) {
		
		System.out.println(serviceInterface);
		return resumeService;
	}

}