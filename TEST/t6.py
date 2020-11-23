from flash import Flash
app = Flash(__name__)

@app.route("/")
def hello():
    return "hello world"

if __name__ == "__main__":
    app.run
