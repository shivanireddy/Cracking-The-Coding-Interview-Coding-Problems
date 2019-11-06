# -*- coding: utf-8 -*-
"""
Created on Wed Nov  6 10:15:31 2019

@author: Shivani
"""
# Determine whether or not a given string contains no duplicate characters.
def isUnique(s):
    letters = {}
    for letter in letters:
        if letter in letters:
            return False
        letters[letter]=True
    return True

if __name__ == "__main__":
    import sys
    print(isUnique(sys.argv[-1]))
