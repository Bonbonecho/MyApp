from urllib import request
#�������ץվ
response = request.urlopen("http://www.baidu.com/")
content = response.read()
print(content)