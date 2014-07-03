package AcceleoExpDSL.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.project.expDSL.*;

public class GenerateLS {
	public String generateLS(ExperimentalPlan plan){
		EList<Factor> f = plan.getFactor();
		String[][] ls = new String[f.size()][f.size()];
		List<String> rows = new ArrayList<String>();
		List<String> cols = new ArrayList<String>();
		int cont=0;
		
		for(int i=0; i<f.size();i++){
			EList<Levels> levels = f.get(i).getLevel();
			if(!f.get(i).getIsDesiredVariation().equalsIgnoreCase("True")){
				cont++;
					for (int j=0;j<levels.size();j++){
						if(cont==0){
							rows.add(j, levels.get(j).getName());
						} else{ if(cont==1){
							cols.add(j, levels.get(j).getName());
						}
						
					
				}
			}
			}
		}
		Collections.sort(rows);
		Collections.sort(cols);
		StringBuilder sb = new StringBuilder();
		sb.append(rows.toString());
		sb.append(cols.toString());
		return sb.toString();
	}

}
