package Business.Concrete;

import Business.Abstract.SalesService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public class SalesManager implements SalesService {

	@Override
	public void sales(Game game, User user, Campaign campaign) {
		if (game.getId() > 0) {
			System.out.println(user.getFirstName() + " isimli kullan�c� " + game.getName() + " adl� oyununu "
					+ campaign.getCampaignName() + " Kampayas�ndan ald� ");

		}

		else {
			System.out.println("Oyun bulunmamaktad�r.Oyun sat��� yap�lamamaktad�r");
		}

	}

}
