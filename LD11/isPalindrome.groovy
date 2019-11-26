class Person {def name}
List<Person> people = [null, new Person(name:"Gweneth")]
for (Person person: people) {
	person?.println person?.getName()
}


println new Date().format('HH:mm:ss')
x = "It is currently ${ new Date().format('HH:mm:ss') }"
assert x.values[0] instanceof String
y = "It is currently ${ writer -> writer << new Date().format('HH:mm:ss') }"
assert y.values[0] instanceof Closure
sleep 1000
println x
println y
