package com.zoffcc.tools;

import org.bitcoinj.core.Utils2;

public class PseudoBitcoinAddress
{
  
  static String generate_address()
  {
    return org.bitcoinj.core.Utils2.gen_pseudo_BTC_address();
  }
}
