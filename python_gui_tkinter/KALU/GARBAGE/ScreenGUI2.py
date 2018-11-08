import tkinter as tk
from tkinter import *
from tkinter import font
from tkinter.filedialog   import askopenfilename
from tkinter import ttk
import textwrap
from AppOperations import AppOperations as ao  			# the class build for this purpose
#from tkMessageBox import *
from tkinter import messagebox
# last parent5

data_valid = 0	# to check if the data was sucessfully inserted or not!

info = [
		("Name (TEXT):",1),
		("e-mail (TEXT):",2),
		("Flat no. (TEXT):",3),
		("Tower no. (TEXT):",4),
		("Area (NUMBER):",5),
		("Parking (TEXT):",6),
		("Recpt. Fess (NUMBER):",7),
		("Address (TEXT):",8),
		("Contact number (TEXT):",9)
		]
e=["","","","","","","","","",""]


root = Tk()
menu = Menu(root)
root.config(menu=menu)
root.title("FLAT-INVENTORY   JIMSOFT")
root.geometry("1000x600+200+200")


print("Starting your application... This may take some time... hold on!")

class Generic:				# this class is used to combine multiple functions to return into 1 function
	def combine_funcs(*funcs):
		# command = combine_funcs(func1, func2)
		def combined_func(*args, **kwargs):
			for f in funcs:
				f(*args, **kwargs)
		return combined_func
	def answer():
		showerror("Answer", "Sorry, no answer available")

	def callback():
		if messagebox.askyesno('Verify', 'Really quit?'):
			if messagebox.showwarning('Save Changes?', 'Commit all existing data ?'):
				print('Changes saved!')
				ao.save_root()
			root.destroy()
		else:
			messagebox.showinfo('No', 'Quit has been cancelled')
	def delete_dummy():
		GUIfunctions.delete_multiple()


# to implement the dialogue warning stuffs on exiting
root.protocol("WM_DELETE_WINDOW",Generic.callback)

class GUIfunctions:
	def insert():
		data_valid = 0		# everytime it is set to 0, on clscreen
		row_no = 1	# row number
		parent1 = Tk()
		parent1.title("FLAT-INVENTORY   JIMSOFT (INSERT MODE)")
		parent1.geometry("1200x600+200+200")
		for data, num in info:
			#print(data,"\t",num)
			tk.Label(parent1, justify=tk.LEFT, padx =10, pady = 10, 
						text=data,font=font.Font(family='Helvetica', size=20, 
						weight='bold')).grid(row=row_no,column=1,sticky=W, pady=4)
			e[num] = tk.Entry(parent1,width = 100)
			e[num].grid(row=row_no, column=2,sticky=W, pady=4)
			row_no = row_no + 2

		Button(parent1, justify=tk.LEFT, padx =10, pady = 10, 
					text='show data', command=CommandsGUI.show_entry_fields).grid(row=20, 
					column=1, sticky=W, pady=4)
		Button(parent1, justify=tk.LEFT, padx =10, pady = 10, 
					text='Insert to database', command=DBOperations.insert_into_db).grid(row=20, 
					column=2, sticky=W, pady=4)
		Button(parent1, justify=tk.LEFT, padx =10, pady = 10, 
					text='reset', command=DBOperations.reset_val).grid(row=20, 
					column=3, sticky=W, pady=4)


	def show():
		def wrap(string, lenght=30):
			return '\n'.join(textwrap.wrap(string, lenght))

		parent2 = Tk()
		parent2.title("FLAT-INVENTORY   JIMSOFT (SHOW DATABASE)")
		parent2.geometry("1900x1000+200+200")
		frame = Frame(parent2)
		frame.pack()
		count = ['sl_no']
		# count the no. of columns present in the db
		count = [0]		# the first one, sl_no
		for data, num in info:
			count.append(num)
		count.append(10)	# time stamp
		print(count)
		tuple_count = tuple(count)	# contains the tuple of the total no. of columns present in the db
		#print(tuple_count)

		tree = ttk.Treeview(frame, columns = tuple_count, height = 30, show = "headings")
		tree.pack(side = 'left')
		tree.heading(0, text = "sl_no")
		tree.column(0, width = 70)			# sl no. width
		for data, num in info:
			if num == 1 or num == 2:
				width_tree = 200
			if num == 8:
				width_tree = 300
			if num in(3,4,5,6,7):
				width_tree = 130
			if num == 9:
				width_tree = 140
			num_i = data.find('(')
			tree.heading(num, text = data[:num_i])
			tree.column(num, width = width_tree)
		tree.heading(10, text = "time stamp")
		tree.column(10, width = 200)
		scroll = ttk.Scrollbar(frame, orient="vertical", command=tree.yview)
		scroll.pack(side = 'right', fill = 'y')
		tree.configure(yscrollcommand=scroll.set)

		list_db = ao.displayData()

		for item in list_db:
			print(item)
			values_t = [] 
			k = 0
			for items in item:
				#print(items)
				values_t.insert(k,wrap(str(items)))
				k=k+1
			tuple_A = tuple(values_t)
			tree.insert('','end', values = tuple_A)


	def update():
		def selectItem(a):
			curItem = tree.focus()
			dict_tree = tree.item(curItem)	# dictionary of the tree
			values_reqd = dict_tree['values']	# a list of the values
			#print(values_reqd)
			date_collected = values_reqd[10]	# date that is collected
			#print(date_collected)
			ao.update_values(date_collected)
			#return date_collected
			row_tup = ao.update_values(date_collected)
			print("tuple needed!",row_tup)
			DataValidation.update_rows(row_tup)

		def wrap(string, lenght=30):
			return '\n'.join(textwrap.wrap(string, lenght))

		parent2 = Tk()
		parent2.title("FLAT-INVENTORY   JIMSOFT (SHOW DATABASE)")
		parent2.geometry("1900x1000+200+200")
		frame = Frame(parent2)
		frame.pack()
		count = ['sl_no']
		# count the no. of columns present in the db
		count = [0]		# the first one, sl_no
		for data, num in info:
			count.append(num)
		count.append(10)	# time stamp
		print(count)
		tuple_count = tuple(count)	# contains the tuple of the total no. of columns present in the db
		#print(tuple_count)

		tree = ttk.Treeview(frame, columns = tuple_count, height = 30, show = "headings")
		tree.pack(side = 'left')
		tree.heading(0, text = "sl_no")
		tree.column(0, width = 70)			# sl no. width
		for data, num in info:
			if num == 1 or num == 2:
				width_tree = 200
			if num == 8:
				width_tree = 300
			if num in(3,4,5,6,7):
				width_tree = 130
			if num == 9:
				width_tree = 140
			num_i = data.find('(')
			tree.heading(num, text = data[:num_i])
			tree.column(num, width = width_tree)
		tree.heading(10, text = "time stamp")
		tree.column(10, width = 200)
		scroll = ttk.Scrollbar(frame, orient="vertical", command=tree.yview)
		scroll.pack(side = 'right', fill = 'y')
		tree.configure(yscrollcommand=scroll.set)

		list_db = ao.displayData()

		for item in list_db:
			print(item)
			values_t = [] 
			k = 0
			for items in item:
				#print(items)
				values_t.insert(k,wrap(str(items)))
				k=k+1
			tuple_A = tuple(values_t)
			tree.insert('','end', values = tuple_A)
		key = tree.bind('<Double-1>', selectItem)	# on double click only

	def delete_multiple():
		def wrap(string, lenght=30):
			return '\n'.join(textwrap.wrap(string, lenght))
		parent7 = Tk()
		parent7.title("FLAT-INVENTORY   JIMSOFT (DELETION MODE)")
		parent7.geometry("1900x1000+200+200")
		#frame = Frame(parent7)
		#frame.pack()
		count = ['sl_no']
		# count the no. of columns present in the db
		count = [0]		# the first one, sl_no
		for data, num in info:
			count.append(num)
		count.append(10)	# time stamp
		print(count)
		tuple_count = tuple(count)	# contains the tuple of the total no. of columns present in the db
		#print(tuple_count)
		
		count_total = ao.countTotalItems()
		list_db = ao.displayData()

		var = []
		row_no = 0
		i = 0
		for i in range(count_total):
		    var.append(IntVar())
		dumy = 0

		for item in list_db:
			print(item)
			values_t = [] 
			k = 0
			for items in item:
				#print(items)
				values_t.insert(k,wrap(str(items)))
				k=k+1
			#tuple_A = tuple(values_t)
			print(values_t)
			str_val = ""
			for item1 in values_t:
				str_val = str_val + item1+"  "
			Checkbutton(parent7, text=str_val, variable=var[dumy]).grid(row=row_no, sticky=W)
			row_no = row_no + 1
			dumy = dumy + 1
			#print("#############",str_val)
		print("Loop exited")
		def show_selected():
			itera = 0
			print("Total count : ",count_total)
			for itera in range(count_total):
				print("Checkbox :::: ",var[itera].get())
				print(itera)
				itera = itera + 1
		Button(parent7, text='show selected', command=show_selected).grid(row=row_no+1, column=2, sticky=W, pady=4)
		mainloop()



class DBOperations:
	def reset_val():
		# to reset all the values that is entered in the form
		print("Reseting values.")
		GUIfunctions.insert()
	
	def insert_into_db():
		print("Inserting data in the db!")
		i_name = e[1].get()
		i_e_mail =  e[2].get()
		i_flat =  e[3].get()
		i_tower = e[4].get()
		i_area =  e[5].get()
		i_parking =  e[6].get()
		i_recpt_fees = e[7].get()
		i_addr =  e[8].get()
		i_contact_no = e[9].get()
		print(i_name," ", i_e_mail," ", i_tower," ", i_flat," ", i_area," ", i_parking," ", i_recpt_fees," ", i_addr," ", i_contact_no)
		# turns 1 if the data was entered sucessfully else it turns 0
		global data_valid
		data_valid = ao.insertData(i_name, i_e_mail, i_tower, i_flat, i_area, 
								i_parking, i_recpt_fees, i_addr, i_contact_no)
		print("VALIDATED ? :",data_valid)
		DataValidation.data_wrong()
class DataValidation:
	def data_wrong():
		row_no = 0
		parent3 = Tk()
		row = Frame(parent3)
		parent3.title("FLAT-INVENTORY   JIMSOFT ( INSERTED ? )")
		parent3.geometry("500x50+200+200")
		#global data_valid
		if data_valid == 1:
			text = "Data entered sucessfully"
			tk.Label(parent3, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
		elif data_valid == 0:
			text = "Ops!! Data couldn't be entered sucessfully"
			tk.Label(parent3, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)

	def update_rows(tuple_rows):
		def get_rows():
			i_sl_no = data_col[1]
			i_name = e[1].get()
			i_e_mail =  e[2].get()
			i_flat =  e[3].get()
			i_tower = e[4].get()
			i_area =  e[5].get()
			i_parking =  e[6].get()
			i_recpt_fees = e[7].get()
			i_addr =  e[8].get()
			i_contact_no = e[9].get()
			i_tmstmp = data_col[11]
			#print(i_sl_no," ",i_name," ", i_e_mail," ", i_flat," ", i_tower," ", i_area," ", i_parking," ", i_recpt_fees," ", i_addr," ", i_contact_no," ",i_tmstmp)
			ao.updateData(i_sl_no, i_name, i_e_mail, i_flat, i_tower, i_area, i_parking, 
				i_recpt_fees, i_addr, i_contact_no, i_tmstmp)
		def data_updated_sucessfully():
			row_no = 0
			parent3 = Tk()
			row = Frame(parent3)
			parent3.title("FLAT-INVENTORY   JIMSOFT ( UPDATED ? )")
			parent3.geometry("500x50+200+200")
			#global data_valid
			text = "Data updated sucessfully"
			tk.Label(parent3, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
		data_valid = 0		# everytime it is set to 0, on clscreen
		row_no = 1	# row number
		parent6 = Tk()
		parent6.title("FLAT-INVENTORY   JIMSOFT (UPDATE ROWS MODE)")
		parent6.geometry("800x800+200+200")
		data_col= [""]
		for data in tuple_rows:
			data_col.append(data)
		print(data_col)
		
		for data, num in info:
			#print(data,"\t",num)
			tk.Label(parent6, justify=tk.LEFT, padx =10, pady = 10, 
						text=data,font=font.Font(family='Helvetica', size=20, 
						weight='bold')).grid(row=row_no,column=1,sticky=W, pady=4)
			e[num] = tk.Entry(parent6,width = 100)
			e[num].insert(END, data_col[num+1])	# to insert an existing data
			#print("####",e[num])
			e[num].grid(row=row_no, column=2,sticky=W, pady=4)
			row_no = row_no + 2

		Button(parent6, justify=tk.LEFT, padx =10, pady = 10, 
					text='update data', command=Generic.combine_funcs(get_rows,data_updated_sucessfully)).grid(row=20, column=1, sticky=W, pady=4)
		Button(parent6, justify=tk.LEFT, padx =10, pady = 10, 
					text='show', command=GUIfunctions.update).grid(row=20, column=2, sticky=W, pady=4)
		
class CommandsGUI:
	# to show the details of every possible data in the app
	def show_entry_fields():
		# For printing the values in the terminal
		row_no = 0
		parent4 = Tk()
		parent4.title("FLAT-INVENTORY   JIMSOFT (SHOW ENTERED VALUES)")
		parent4.geometry("900x600+200+200")
		text = "The values entered :"
		tk.Label(parent4, justify=tk.LEFT, padx =10,  pady = 10, 
					text=text,font=font.Font(family='Helvetica', 
					size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
		row_no = row_no + 2

		for data, num in info:
			text = ""
			text = "{:<25s}{:>25s}".format(data, e[num].get())
			tk.Label(parent4, justify=tk.LEFT, padx =10,  pady = 10, 
						text=text,font=font.Font(family='Helvetica', 
						size=12, weight='bold')).grid(row=row_no,column=1, sticky=W, pady=4)
			row_no = row_no+2
		#DataValidation.data_wrong()
	def show():
		GUIfunctions.show()
		print("The content of the whole db!")

	# to change some specific contents of the database app
	def change():
		GUIfunctions.update()
		print("The content of some specific key is changed!")

	# to insert some contents in the dbapp
	def insert():
		GUIfunctions.insert()
		print("Insert the contents!")

	# to remove some specific contents from the app
	def remove():
		GUIfunctions.delete_multiple()
		print("Delete multiple contents!")

	# to calculate the bill from the menu
	def calculate_bill():
		print("To calculate the bill!")

	### Not needed till now!
	def OpenFile():
	    name = askopenfilename()
	    print (name)
	def About():
	    print("This is a simple example of a menu")

class ScreenGUI:
	# the details menu of the first tab
	def detailsMenu():
		detailsmenu = Menu(menu)
		menu.add_cascade(label="Details", menu=detailsmenu,font=font.Font(family='Helvetica', size=18, weight='bold'))
		# acessing the show method from CommandsGUI as CommandsGUI.show
		detailsmenu.add_command(label="Show", command=CommandsGUI.show,font=font.Font(family='Helvetica', size=17, weight='bold'))

	# the manipulate menu
	def manipulateMenu():
		manipulatemenu = Menu(menu)
		menu.add_cascade(label="Manipulate", menu=manipulatemenu,font=font.Font(family='Helvetica', size=18, weight='bold'))
		# sub commands in the menu, calling the function
		manipulatemenu.add_command(label="change", command=CommandsGUI.change,font=font.Font(family='Helvetica', size=17, weight='bold'))
		manipulatemenu.add_command(label="insert", command=CommandsGUI.insert,font=font.Font(family='Helvetica', size=17, weight='bold'))
		manipulatemenu.add_command(label="remove", command=CommandsGUI.remove,font=font.Font(family='Helvetica', size=17, weight='bold'))

	# the bill menu
	def billMenu():
		billmenu = Menu(menu)
		menu.add_cascade(label="Bills", menu=billmenu,font=font.Font(family='Helvetica', size=18, weight='bold'))
		billmenu.add_command(label="calculate", command=CommandsGUI.calculate_bill,font=font.Font(family='Helvetica', size=17, weight='bold'))

if __name__ == "__main__":
	ScreenGUI.detailsMenu()
	ScreenGUI.manipulateMenu()
	ScreenGUI.billMenu()
	mainloop()

