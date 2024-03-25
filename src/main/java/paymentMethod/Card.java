package paymentMethod;

import thing.Receipt;

public class Card extends PaymentMethod {

  public Card() {
    super();
  }

  @Override
  public Receipt transact() {

    //승인: 잔돈 0원
    //거절: 한도 초과
    return null;
  }


}
