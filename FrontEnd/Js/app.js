document.getElementById("btnAddPlace").addEventListener("click", function () {
    let name = document.getElementById("txtPlaceName").value;
    let desc = document.getElementById("txtPlaceDesc").value;
    let image = document.getElementById("imgPlace").files[0];

        var formdata = new FormData();
        formdata.append("name", name);
        formdata.append("description", desc);
        formdata.append("placeImage", image);
        
        var requestOptions = {
          method: 'POST',
          body: formdata,
          redirect: 'follow'
        };
        
        fetch("http://localhost:8080/saveImage/add", requestOptions)
          .then(response => response.text())
          .then(result => console.log(result))
          .catch(error => console.log('error', error));


});
