import random

uwutext = input("pwease input text uwu: ")
# replacing letters uwu
# TODO add a percentage for stuttering
uwutext = (
    uwutext.lower()
    .replace("l", "w")
    .replace("r", "w")
    .replace("v", "f")
    .replace("i", "i-i")
    .replace("d", "d-d")
    .replace("n", "n-n")
    + " >~<"
)


print(uwutext)
