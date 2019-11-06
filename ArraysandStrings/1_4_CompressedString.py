# -*- coding: utf-8 -*-
"""
Created on Wed Nov  6 11:12:05 2019

@author: Shivani
"""
def compress(s):
    if len(s)==0: return s
    parts = []
    current_letter = s[0]
    current_count = 1
    for letter in s[1:]:
        if current_letter==letter:
            current_count+=1
        else:
            parts.append(current_letter+str(current_count))
            current_letter = letter
            current_count = 1
    parts.append(current_letter+str(current_count))
    compressed = "".join(parts)
    if len(compressed) < len(s):
        return compressed
    else:
        return s


if __name__ == "__main__":
  import sys
  print(compress(sys.argv[-1]))