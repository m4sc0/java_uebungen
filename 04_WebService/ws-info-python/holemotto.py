import urllib.request
with urllib.request.urlopen('http://localhost:8080/motto') as res:
    json = res.read()
    print(f"Mein Motto lautet: {json}")