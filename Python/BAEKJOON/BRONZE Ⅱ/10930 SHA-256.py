import hashlib

S = input().encode('utf-8')
hashCode = hashlib.new('sha256')
hashCode.update(S)
print(hashCode.hexdigest())