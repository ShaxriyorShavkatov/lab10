document.addEventListener("DOMContentLoaded", () => {
  console.log("Document loaded")

  const form = document.querySelector("form")
  if (form) {
    form.addEventListener("submit", (event) => {
      const nameInput = document.getElementById("name")
      if (nameInput && nameInput.value.trim() === "") {
        event.preventDefault()
        alert("Please enter your name")
      }
    })
  }
})

