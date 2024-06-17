# import initdb
# import util

# db = initdb.connectDb()
# cur = db.cursor()

# sql = "SELECT genre FROM categories"

# cur.execute(sql)

# print(type(cur))
# print(cur)

# for x in cur:
#     print(type(x))
#     print(x[0])


# print("-"*64)

# var = util.getWriters(cur)

# print(var)
# for x in var:
#     print(x[1])

# util.addWriter("Henry Manampiring")
# util.showWriter()

# util.db.commit()
# util.db.close()

a = 1
b = 2

tup = [a,b]

print (tup)