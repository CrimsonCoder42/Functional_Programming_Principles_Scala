package lectures.oop

object Enums extends App {

  enum Permissions {
    case READ, WRITE, EXECUTE, NONE

    // add fields/methods
    def openDocument(): Unit =
      if (this == READ) println("opening document...")
      else println("reading not allowed.")
  }

  val somePermissions: Permissions = Permissions.READ

  // constructor args
  enum PermissionsWithBits(bits: Int) {
    case READ extends PermissionsWithBits(4) // 100
    case WRITE extends PermissionsWithBits(2) // 010
    case EXECUTE extends PermissionsWithBits(0) // 000
    case NONE extends PermissionsWithBits(0)
  }

  object PermissionsWithBits {
    def fromBits(bits: Int): PermissionsWithBits = // whatever
    PermissionsWithBits.NONE
  }

  // standard API
  val somePermissionsOrdinal = somePermissions.ordinal
  val allPermissions = PermissionsWithBits.values // array of all possible values of the enum
  val readPermissions: Permissions = Permissions.valueOf("READ") // permissions. READ



//  def main(args: Array[String]): Unit = {
//    somePermissions.openDocument()
//    println(somePermissionsOrdinal)
//  }



}
