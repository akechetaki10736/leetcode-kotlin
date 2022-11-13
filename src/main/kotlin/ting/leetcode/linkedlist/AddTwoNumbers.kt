package ting.leetcode.linkedlist

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val customHead = ListNode(0)
        var currentNode: ListNode? = customHead
        var firstPointer = l1
        var secondPointer = l2
        while (firstPointer != null || secondPointer != null) {
            val l1nodeValue = firstPointer?.`val` ?: 0
            val l2nodeValue = secondPointer?.`val` ?: 0
            currentNode?.next = ListNode(l1nodeValue + l2nodeValue).also {
                firstPointer = firstPointer?.next
                secondPointer = secondPointer?.next

                if (it.`val` >= 10) {
                    when(firstPointer) {
                        null -> {
                            it.next = ListNode(1)
                            firstPointer = it.next
                        }
                        else -> firstPointer?.`val` = firstPointer?.`val`!! + 1
                    }
                    it.`val` -= 10
                }
                currentNode = it
            }
        }
        return customHead.next
    }
}