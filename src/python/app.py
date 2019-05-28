import socket

from flask import Flask
from flask_restful import Resource, Api

app = Flask(__name__)
api = Api(app)


def get_my_ip():
    s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    s.connect(("8.8.8.8", 80))
    ip = s.getsockname()[0]
    s.close()
    return ip


class HelloWorld(Resource):
    def get(self, who='Stranger'):
        return {'hello': who, 'IP': get_my_ip()}


api.add_resource(HelloWorld, '/greeting', '/greeting/<string:who>')
if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0', port=3000)
