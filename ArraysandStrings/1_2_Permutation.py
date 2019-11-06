# -*- coding: utf-8 -*-
"""
Created on Wed Nov  6 10:23:16 2019

@author: Shivani
"""

#Given two strings, write a method to decide if one is a permutation of the other.

def is_permutation(s1,s2):
    counter = Counter()
    for letter in s1:
        counter[letter]+=1
    for letter in s2:
        if not letter in counter:
            return False
        counter[letter]-=1
        if counter[letter]==0:
            del counter[letter]
    return len(counter==0)
        


class Counter(dict):
  def __missing__(self, key):
    return 0

if __name__ == "__main__":
  import sys
  print(is_permutation(sys.argv[-2], sys.argv[-1]))