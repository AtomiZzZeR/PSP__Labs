"use strict"

let obj1 = {
  name: "Vasya",
  surname: "Gogov",
  position: "Senjor",
  salary: 2000,
}

let obj2 = {
  name: "Denis",
  surname: "Rendrov",
  position: "Junior",
  salary: 20,
}

let obj3 = {
  name: "Valera",
  surname: "Mogov",
  position: "Middle",
  salary: 200,
}

let arr = [obj1, obj2, obj3];

// document.write(JSON.stringify(arr));

// for (let i = 0; i <= arr.length - 1; i++) {
//     document.write(arr[i]);
// }

document.write("<p>Первый сотрудник: " + JSON.stringify(obj1) + "<br></p><hr>");
document.write("<p>Второй сотрудник: " + JSON.stringify(obj2) + "<br></p><hr>");
document.write("<p>Третий сотрудник: " + JSON.stringify(obj3) + "<br></p><hr>");