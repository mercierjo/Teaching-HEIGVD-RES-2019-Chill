package ch.heigvd.res.chill.domain.MaximilianCVogel;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class KoenigLudwig implements IProduct {

  public final static String NAME = "Koenig Ludwig";
  public final static BigDecimal PRICE = new BigDecimal(3.6);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
