temp = input("Enter a temperature and its unit (e.g., 100C or 212F): ")

if temp[-1].upper() == 'C':
    celsius = float(temp[:-1])
    fahrenheit = (celsius * 9 / 5) + 32
    kelvin = celsius + 273.15
    print(f"{celsius}°C is equal to {fahrenheit:.2f}°F and {kelvin:.2f} K")

elif temp[-1].upper() == 'F':
    fahrenheit = float(temp[:-1])
    celsius = (fahrenheit - 32) * 5 / 9
    kelvin = celsius + 273.15
    print(f"{fahrenheit}°F is equal to {celsius:.2f}°C and {kelvin:.2f} K")

elif temp[-1].upper() == 'K':
    kelvin = float(temp[:-1])
    celsius = kelvin - 273.15
    fahrenheit = (celsius * 9 / 5) + 32
    print(f"{kelvin} K is equal to {celsius:.2f}°C and {fahrenheit:.2f}°F")

else:
    print("Invalid input. Please enter a temperature followed by its unit (C, F, or K).")
