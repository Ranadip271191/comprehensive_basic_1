
#!/Library/Frameworks/Python.framework/Versions/3.10/bin/python3
from copy import copy,deepcopy


Principal_Amount = 1000000.00
Monthly_EMI = 15000.00
Interest_Rate = 12

#number of years take to complete principal
Principal_Amount_period_year = (Principal_Amount/Monthly_EMI)/12

#Simple interest formula  A = P (1+rt)
#P = Principal Amount
#R = Rate of interest
#t = Number of years
#A = Total accrued amount (Both principal and the interest)

#total interest amount based on Principal_Amount_period_year
Interest_Amount = (Principal_Amount*(1+12*Principal_Amount_period_year))/100

print(Principal_Amount_period_year)

print(Interest_Amount)

#total amount with interest
Total_Amount_with_interest = Principal_Amount  + Interest_Amount

print(Total_Amount_with_interest)

#EMI tenure in months
Total_EMI_tenure_in_Month = Total_Amount_with_interest / Monthly_EMI
print("Total EMI tenure  in months -> {:.2f} months".format(+ Total_EMI_tenure_in_Month))

#EMI tenure in years
Total_EMI_tenure_in_Year  = Total_EMI_tenure_in_Month/12
print("Total EMI tenure  in years -> {:.2f} years".format(+ Total_EMI_tenure_in_Year))
