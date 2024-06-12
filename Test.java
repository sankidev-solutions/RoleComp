import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("started");
		Map<String,List<String>> userPref = new HashMap<>();
		List<String> entities = Arrays.asList("CBF","CBL","LuxCSD");
		List<String> assetChains = Arrays.asList("D7AC","HQLAx");
		List<String> paymentChains = Arrays.asList("BBk","BdI","BdF");
		userPref.put("entity", entities);
		userPref.put("ac", assetChains);
		userPref.put("pc", paymentChains);
		
		
		
		List<String> userRoles = Arrays.asList("CBF DeFi Issuer",
				"CBF DeFi DvP BBk","CBF DeFi DvP BdI API","CBF DeFi DvP D7AC","CBF DeFi DvP HQLAx");
		
		User user = new User();
		Set<String> userEntities = new HashSet<String>();
		for(String role:userRoles) {
			
			if(role.contains("Operator")) {
				user.setOperator(true);
			}
			else if(role.contains("Read Only")) {
				user.setReadOnly(true);
			}
			
			if(role.contains("Issuer")) {
				user.setIssuer(true);
			}
			
			if(role.contains("DvP")) {
				user.setDvp(true);
			}
			
			String[] tokens = role.split(" ");
			for(String token:tokens) {
				
				
				
				if(entities.contains(token)) {
					user.setEntity(token);
				}
				
				
				
				if(assetChains.contains(token)) {
					user.getAssetChains().add(token);
				}
				
				if(paymentChains.contains(token)) {
					user.getPaymentChains().add(token);
				}
				
			}
			
		}
		
		System.out.println(user);
		
	}

}
