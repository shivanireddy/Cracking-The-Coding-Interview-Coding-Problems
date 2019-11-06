# -*- coding: utf-8 -*-
"""
Created on Wed Nov  6 10:32:06 2019

@author: Shivani
"""

#replace all spaces in a string with'%20'

def escape_spaces(s):
    return s.strip().replace(" ","%20")

if __name__ == "__main__":
  import sys
  print(escape_spaces(sys.argv[-1]))