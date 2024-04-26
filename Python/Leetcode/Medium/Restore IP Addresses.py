class Solution:
    def restoreIpAddresses(self, s: str) -> list[str]:

        length = len(s)
        IP = []

        def Backtracking(to: int, i: int, address: list[str]):
            if((to == length and i < 4) or (to < length and i == 4)):
                return

            if(to == length and i == 4):
                IP.append('.'.join(address))
                return

            for k in range(3):
                addressFrom = to + k + 1

                if(addressFrom <= length):
                    bit32 = s[to:addressFrom]
                    intBit32 = int(bit32)
                    if(len(bit32) == len(str(intBit32)) and (intBit32 < 256)):
                        address.append((bit32))
                        Backtracking(addressFrom, i + 1, address)
                        address.pop()
                else:
                    break

        Backtracking(0, 0, [])

        return IP

solution = Solution()
print(solution.restoreIpAddresses("25525511135"))
print(solution.restoreIpAddresses("0000"))
print(solution.restoreIpAddresses("101023"))