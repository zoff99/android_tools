package com.zoffcc.tools;

import org.bitcoinj.core.Utils2;

public class PseudoBitcoinAddress
{
  
  public static String generate_address()
  {
    return org.bitcoinj.core.Utils2.gen_pseudo_BTC_address();
  }


  public static String generate_address(int length)
  {
    return org.bitcoinj.core.Utils2.gen_pseudo_BTC_address().substring(0, length);
  }
}
