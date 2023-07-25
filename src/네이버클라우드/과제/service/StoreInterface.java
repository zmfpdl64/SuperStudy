package 네이버클라우드.과제.service;

import 네이버클라우드.과제.entity.Guest;

public interface StoreInterface {
    public boolean guestAskItem(Guest guest) throws Exception;
    public boolean guestCanBuyItem(Guest guest);
    public boolean isGuestPreferBuy(Guest guest);
    public void buyItem(Guest guest) throws Exception;
    public void  goToStore(Guest guest);
}
